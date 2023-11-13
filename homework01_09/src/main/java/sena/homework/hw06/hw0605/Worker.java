package sena.homework.hw06.hw0605;

/**
 * @author Sergej Chumakov on 11.10.2023
 */
public class Worker implements Comparable<Worker>{

    private String fio;
    private String position;
    private int recruitmentYear;

    public Worker(String fio, String position, int recruitmentYear) {
        this.fio = fio;
        this.position = position;
        this.recruitmentYear = recruitmentYear;
    }

    public int getRecruitmentYear() {
        return recruitmentYear;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", recruitmentYear=" + recruitmentYear +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.fio.compareTo(o.fio);
    }

    public String getSecondName() {
        return fio.split(" ")[0];   // тому що у завданні написано вивести прізвище, а не повністю з ініціалами
    }
}
