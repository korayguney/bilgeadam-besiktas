package com.bilgeadam.examsolutions.q1;

import java.util.Arrays;

public class Chapter {

    private int no;
    private String title;
    private Page[] pages;

    public Chapter(int no, String title, Page[] pages) {
        this.no = no;
        this.title = title;
        this.pages = pages;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Page[] getPages() {
        return pages;
    }

    public void setPages(Page[] pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", pages=" + Arrays.toString(pages) +
                '}';
    }

    public String getInfo(){
        return this.toString();
    }

}
