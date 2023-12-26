package lab_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserRegistrationApp {
    private Map<String, Double> users = new HashMap<>();
    private double a = 0.5;

    public UserRegistrationApp() {
        loadUsersData(); // Завантаження збережених користувачів

        JFrame frame = new JFrame("Реєстрація та авторизація");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(4, 2));

        JLabel usernameLabel = new JLabel("Ім'я користувача:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Пароль:");
        JPasswordField passwordField = new JPasswordField();

        JButton registerButton = new JButton("Зареєструватися");
        JButton loginButton = new JButton("Увійти");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerButton);
        panel.add(loginButton);

        JTextArea logTextArea = new JTextArea(5, 20);
        logTextArea.setEditable(false);
        panel.add(new JScrollPane(logTextArea));

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Будь ласка, введіть ім'я користувача та пароль.");
                } else if (users.containsKey(username)) {
                    JOptionPane.showMessageDialog(frame, "Користувач з таким ім'ям вже існує.");
                } else if (!isPasswordComplex(password)) {
                    JOptionPane.showMessageDialog(frame, "Пароль повинен мати мінімум 8 символів, включаючи принаймні одну літеру верхнього регістру, одну літеру нижнього регістру та одну цифру.");
                } else {
                    double passwordHash = computePasswordHash(password);
                    users.put(username, passwordHash);
                    saveUserData(username, password, getCurrentDateTime()); // Збереження реєстраційних даних у текстовий файл
                    logTextArea.append("Користувач " + username + " зареєстрований. Час реєстрації: " + getCurrentDateTime() + "\n");
                    usernameField.setText("");
                    passwordField.setText("");
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (users.containsKey(username)) {
                    double enteredHash = computePasswordHash(password);
                    if (Math.abs(enteredHash - users.get(username)) < 1e-6) {
                        JOptionPane.showMessageDialog(frame, "Авторизація успішна для користувача " + username + ".");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Невірне ім'я користувача або пароль.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Користувача з таким ім'ям не знайдено.");
                }
            }
        });

        frame.setVisible(true);
    }
    private double computePasswordHash(String password) {
        double x = 0.0;
        for (char c : password.toCharArray()) {
            x += (int) c;
        }
        return Math.exp(-a * x);
    }
    private void saveUserData(String username, String password, String registrationTime) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("RegistrationData.txt", true))) {
            writer.write(username + "," + password + "," + registrationTime + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUsersData() {
        // Завантаження користувачів з файлу
        try (BufferedReader reader = new BufferedReader(new FileReader("RegistrationData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String username = parts[0];
                    String password = parts[1];
                    double passwordHash = computePasswordHash(password);
                    users.put(username, passwordHash);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private boolean isPasswordComplex(String password) {
        // Перевірка на мінімальну довжину 8 символів та наявність різних символів
        return password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
    private String getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserRegistrationApp());
    }
}
