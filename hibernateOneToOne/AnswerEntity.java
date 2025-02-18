package org.hibernateOneToOne;


import javax.persistence.*;

@Entity
@Table(name = "Answer")
public class AnswerEntity {

    @Id
    @Column(name = "answerId")
    private int answerId;

    public void setQuestion(QuestionEntity question) {
        this.question = question;
    }

    @Column(name = "answer")
    private String answer;

    @OneToOne
    private QuestionEntity question;

    public AnswerEntity() {
    }

    public AnswerEntity(int answerId, String answer) {
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
}
