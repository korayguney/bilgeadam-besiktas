package com.bilgeadam.albumsongchallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestPlaylist {
    public static void main(String[] args) {
        Album album1 = new Album("Mançoloji", "Barış Manço");
        album1.addSong("Dağlar Dağlar", 3.20);
        album1.addSong("Gülpembe", 4.20);
        album1.addSong("İşte Hendek İşte Deve", 3.20);
        album1.addSong("Sarı Çizmeli Mehmet Ağa", 3.20);
        album1.addSong("Kara Sevda", 3.20);
        album1.addSong("Hal Hal", 5.20);
        album1.addSong("Aynalı Kemer", 3.20);

        Album album2 = new Album("Karma", "Tarkan");
        album2.addSong("Aşk", 4.54);
        album2.addSong("Ay", 4.54);
        album2.addSong("Kuzu Kuzu", 4.54);
        album2.addSong("Gitti gideli", 4.53);

        List<Album> albums = new LinkedList<>();
        albums.add(album1);
        albums.add(album2);

        // create playlist
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist(1, playList);
        albums.get(0).addToPlaylist(2, playList);
        albums.get(0).addToPlaylist(3, playList);
        albums.get(0).addToPlaylist(4, playList);
        albums.get(0).addToPlaylist(5, playList);

        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist("Gitti gideli", playList);

        ListIterator<Song> iterator = playList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Size of playlist : " + playList.size() );

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        ListIterator<Song> iterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("There is no song in the playlist");
            return;
        } else {
            System.out.println("Now playing " + iterator.next().toString());
        }

        while (flag){
            printMenu();
            String choice = scanner.nextLine();

            switch (choice){
                case "0":
                    flag = false;
                    break;
                case "1":
                    playNextSong(iterator);
                    break;
                case "2":
                    playPreviousSong(iterator);
                    break;
                case "3":
                    showPlaylistSongs(playList);
                    break;
            }
        }
    }

    private static void showPlaylistSongs(LinkedList<Song> playList) {
        System.out.println("========= PLAYLIST ===========");
        playList.forEach(t -> System.out.println(t));
    }

    private static void playPreviousSong(ListIterator<Song> iterator) {
        System.out.println("=====================");
        if(iterator.hasPrevious()){
            System.out.println("Now playing : " + iterator.previous());
        } else {
            System.out.println("The playlist is at the beginning");
        }



    }

    private static void playNextSong(ListIterator<Song> iterator) {
        System.out.println("=====================");
        if(iterator.hasNext()){
            System.out.println("Now playing : " + iterator.next());
        } else {
            System.out.println("The playlist is reached to the end");
        }
    }

    private static void printMenu() {
        System.out.println("=====================");
        System.out.println("Select one of the choices:");
        System.out.println("0- Quit from playlist");
        System.out.println("1- Play next song");
        System.out.println("2- Play previous song");
        System.out.println("3- List playlist songs");


    }


}
