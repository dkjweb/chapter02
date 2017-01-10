package chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum( "Real" );
		song.setArtist( "아이유" );
		song.setComposer( "이민수" );
		song.setTitle( "좋은날" );
		song.setTrack( 3 );
		song.setYear( 2010 );
		
		song.show();
		
		Song song2 = 
			new Song( "", 
					  "에일리", 
					  "", 
					  "첫눈처럼 너에게 가겠다", 
					  0, 
					  2017);
		song2.show();
		
		Song song3 = new Song( "크러쉬", "Beautiful" );
		song3.show();

		Song song4 = new Song( "어반 자카파", "소원" );
		song4.show();

	}

}
