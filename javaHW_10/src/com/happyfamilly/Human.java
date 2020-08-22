package com.happyfamilly;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public abstract class Human {
    private String name;
    private String surname;
    private long birthDay;
    private int iq;
    private Family family;
    private Map<DayOfWeek, String> schedule = new HashMap<>();

    private SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    static {
        System.out.println("Загрузка класса: Human");
    }
    {
        System.out.println("Cоздается новый объект: Human");
    }


    public Human() {}
    public Human(String name, String surname, String birthDay) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date parseDate = formatDate.parse(birthDay);
        this.birthDay = parseDate.getTime();
    }

    public Human(String name, String surname, String birthDay, int iq, Family family, Map<DayOfWeek, String> schedule) throws ParseException {
        this(name, surname, birthDay);
        this.iq = iq;
        this.family = family;
        this.schedule = schedule;
    }


    public Human(String name, String surname, String birthDay, int iq) throws ParseException {
        this(name, surname, birthDay);
        this.iq = iq;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getBirthDay() { return birthDay; }
    public void setBirthDay(Long birthDay) { this.birthDay = birthDay; }

    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }
    public void setFamily(Family family) {
        this.family = family;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }
    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }




    public String describeAge() throws ParseException {
        System.out.println(" ");
        Date dateBirthDay = new Date(birthDay);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateBirthDay);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        LocalDate localDateBirthDay = LocalDate.of(year, month+1, days);
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(localDateBirthDay, dateNow);

        String liveTime = "Years: " + period.getYears() + "\nMonth: " + period.getMonths() + "\nDays: " + period.getDays();
        System.out.println((getName() + " " + getSurname()).toUpperCase());
        System.out.println("Date of birthday: " + formatDate.format(dateBirthDay));
        System.out.println(liveTime);
        System.out.println(" ");
        return liveTime;
    }

    public abstract void greetPet();
    public void describePet(){
        if(family == null || family.getPets() == null){
            System.out.println("Нет животного");
        }else {
            for (Pet pet : family.getPets()) {
                Species petSpecies = pet.getSpecies();
                int petAge = pet.getAge();
                String petVarTrickLevel = pet.varTrickLevel();
                System.out.println("У меня есть " + petSpecies + ", ему " + petAge + " лет, он " + petVarTrickLevel);
            }
        }

    }
    public boolean feedPet(boolean isTimeToFeed){
        if(family == null || family.getPets() == null){
            return false;
        }else {
            for(Pet pet : family.getPets()){
                int trickLevel = pet.getTrickLevel();
                if(isTimeToFeed){
                    System.out.println("Накормил " + pet.getNickname());
                }else {
                    Random random = new Random();
                    int startNum = 0;
                    int endNum = 100;
                    int randomResult = startNum + random.nextInt(endNum - startNum + 1);
                    if(trickLevel > randomResult){
                        System.out.println("Хм... покормлю ка я, " + pet.getNickname());
                    }else{
                        System.out.println("Думаю, " + pet.getNickname() + " не голоден.");
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }


    @Override
    public String toString(){
        return  "Human" + " {" +
                "name = " + "\'" + name + "\'" + ", " +
                "surname = " + "\'" + surname + "\'" + ", " +
                "birthDay = " + formatDate.format(birthDay) + ", " +
                "iq = " + iq + ", " +
                "schedule = " + schedule + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return birthDay == human.birthDay &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDay);
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize human: " + toString());
    }

}



