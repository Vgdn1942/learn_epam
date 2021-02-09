package com.vgdn1942.progwithclasses;

class RunStudent {
    public static void main(String[] args) {

        Student[] student = {
                new Student("Иванов", "А.Б.", 10, new int[]{10, 9, 9, 10, 10}),
                new Student("Петров", "В.М.", 11, new int[]{9, 8, 9, 9, 9}),
                new Student("Сидоров", "В.Г.", 12, new int[]{7, 7, 9, 8, 10}),
                new Student("Ковалёв", "В.М.", 13, new int[]{10, 10, 10, 10, 10}),
                new Student("Казаков", "Д.Е.", 14, new int[]{9, 9, 9, 9, 9}),
                new Student("Козлов", "Б.А.", 15, new int[]{10, 9, 10, 10, 10}),
                new Student("Джавов", "Г.В.", 16, new int[]{6, 8, 7, 8, 8}),
                new Student("Епамов", "Н.Н.", 17, new int[]{9, 9, 9, 10, 9}),
                new Student("Семёнов", "М.М.", 18, new int[]{8, 9, 9, 8, 10}),
                new Student("Титов", "А.Г.", 19, new int[]{10, 10, 9, 10, 9})
        };

        boolean isBetter;
        System.out.println("Список студентов с оценками не ниже 9:");
        for (Student value : student) {
            isBetter = true;
            for (int j = 0; j < value.getProgress().length; j++) {
                if (value.getProgress()[j] < 9) {
                    isBetter = false;
                }
            }
            if (isBetter) {
                System.out.println(value.getSurname() + " из группы " + value.getGroup());
            }
        }
    }
}

public class Student {
    private String surname;
    private String initials;
    private int group;
    private int[] progress;

    Student(String surname, String initials, int group, int[] progress) {
        this.surname = surname;
        this.initials = initials;
        this.group = group;
        this.progress = progress;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int getGroup() {
        return group;
    }

    public int[] getProgress() {
        return progress;
    }
}
