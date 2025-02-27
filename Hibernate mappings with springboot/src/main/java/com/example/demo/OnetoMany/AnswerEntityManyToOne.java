package com.example.demo.OnetoMany;


import jakarta.persistence.*;


@Entity
//@Table(name = "Answer")
public class AnswerEntityManyToOne {

    @Id
    @Column(name = "answerId")
    private int answerId;

//    public void setQuestion(QuestionEntityOneToMany question) {
//        this.question = question;
//    }

    @Column(name = "answer")
    private String answer;

//    @ManyToOne
//    @JoinColumn
//    private QuestionEntityOneToMany question;

    public AnswerEntityManyToOne() {
    }

    public AnswerEntityManyToOne(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AnswerEntityManyToOne{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
//                ", question=" + question +
                '}';
    }
}
