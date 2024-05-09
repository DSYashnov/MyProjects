package MiniMusicPlayer2;

import javax.sound.midi.*;

class MiniMusicPlayer2 implements ControllerEventListener { //Нам нужно отслеживать события ControllerEvent
															   //поэтому мы реализуем интерфейс слушателя
	public static void main (String[]args){
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
		
	}
	public void go(){
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventIWant = {127};
			sequencer.addControllerEventListener(this, eventIWant); //Регистрируем события синтезатором. Метод отвечающий за регистрацию, принимает объект
																		//слушателя и целочисленный массив, предсьавляющий собой ControllerEvent, которые
																		//нам нужны. Нас интересует только одно событие - №127.
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i = 5; i < 60; i += 4) {
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i)); //Вот так мы ловим ритм - добавляем наше собственное событие ControllerEvent (176 означает
														  //что  тип события - ControllerEvent) с аргументом для события №127. Оно ничего не будет делать!
														  //Мы вставляем его лишь для того, чтобы иметь возможность реагировать на воспроизведение каждой ноты.
														  //Другими словами, его единственная цель - запуск чего-нибудь, что можно отслеживать (мы не можем
														  //следить за событиями включения/выключения воспроизведения нот). Заметьте, что мы запускаем это
														  //событие в тот же самый момент, когда включается воспроизведение ноты.
														  //Поэтому когда произойдет событие включения воспроизведения ноты, мы сразу узнаем об этом, так как
														  //наше событие запустится в то же самое время.
				
				track.add(makeEvent(128, 1, i, 100, i + 2));
			}//конец цикла
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {ex.printStackTrace();}
	}//Закрываем
	
	public void controlChange (ShortMessage event) { //Метод обработки события (из интерфейса слушателя события ControllerEvent). При каждом получении
		System.out.println("ля");					 	//события мы пишем в командной строке слово "ля".
		
	}
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {}
		return event;
	}
}

				
	