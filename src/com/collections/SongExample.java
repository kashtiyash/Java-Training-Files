package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

class Song {
	String songName;
	String songComposer;

	public Song(String songName, String songComposer) {
		super();
		this.songName = songName;
		this.songComposer = songComposer;
	}

	@Override
	public String toString() {
		return "Song Name = " + songName + ", Song Composer = " + songComposer;
	}

}

class Singer {
	String singerName;
	int singerAge;
	String dob;
	ArrayList<Song> songs;

	public Singer(String singerName, int singerAge, String dob, ArrayList<Song> songs) {
		super();
		this.singerName = singerName;
		this.singerAge = singerAge;
		this.dob = dob;
		this.songs = songs;
	}

}

public class SongExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter Singer Name , Singer Age\n");
		String singerName = s.next();
		int singerAge = s.nextInt();
		System.out.println("\nEnter Singer DOB");
		String dob = s.next();
		System.out.println("Enter count of songs :");
		int count = s.nextInt();
		ArrayList<Song> song = new ArrayList<>();

//Input of songs from user
		for (int index = 0; index < count; index++) {
			System.out.println("Enter Song Name:");
			String songName = s.next();
			System.out.println("Enter Composer Name : ");
			String composerName = s.next();
			Song s1 = new Song(songName, composerName);
			song.add(s1);
		}

		Singer singer1 = new Singer(singerName, singerAge, dob, song);
//		Printing Singer Details  
		System.out.println("\nSinger Name : " + singer1.singerName);
		System.out.println("Singer Age : " + singer1.singerAge);
		System.out.println("Singer DOB : " + singer1.dob);
		for (Song songs : song) {
			System.out.println(songs);
		}

	}

}
