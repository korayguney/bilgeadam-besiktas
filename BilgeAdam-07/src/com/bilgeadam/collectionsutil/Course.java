package com.bilgeadam.collectionsutil;

import java.io.Serializable;

public class Course implements Serializable, Comparable<Course>{


   private static final long serialVersionUID = 1L;

   private int course_id;
   private String course_name;

   public Course(int course_id, String course_name) {
      this.course_id = course_id;
      this.course_name = course_name;
   }

   public int getCourse_id() {
      return course_id;
   }

   public void setCourse_id(int course_id) {
      this.course_id = course_id;
   }

   public String getCourse_name() {
      return course_name;
   }

   public void setCourse_name(String course_name) {
      this.course_name = course_name;
   }

   @Override
   public String toString() {
      return "course_name=" + course_name;
   }


   @Override
   public int compareTo(Course that) {
      if (this.getCourse_name() == null && that.getCourse_name() == null) {
         return 0;
      } else if (this.getCourse_name() == null) {
         return -1;
      } else if (that.getCourse_name() == null) {
         return 1;
      } else {
         return this.getCourse_name().compareTo(that.getCourse_name());
      }
   }


}
