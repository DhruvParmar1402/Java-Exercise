package org.hibernateOneToManyMapping.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int que_id;

    @Column(name = "question")
    private String question;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers;

    public Questions() {
    }

    public Questions(int que_id, String question, List<Answer> answers) {
        this.que_id = que_id;
        this.question = question;
        this.answers = answers;
    }

    public int getQue_id() {
        return que_id;
    }

    public void setQue_id(int que_id) {
        this.que_id = que_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        answers.forEach((x)->sb.append(x.getAnswer()+"\n"));
        return "Questions{" +
                "que_id=" + que_id +
                ", question='" + question + '\'' +
                ", answers="+ sb.toString()+
                '}';
    }
}
