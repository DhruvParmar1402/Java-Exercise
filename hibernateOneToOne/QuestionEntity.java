package org.hibernateOneToOne;


import javax.persistence.*;

@Entity
@Table(name = "Question")
public class QuestionEntity {

    @Id
    @Column(name = "QuestionId")
    private int question_id;

    @Column(name = "Question")
    private String question;

    @OneToOne(mappedBy = "question", cascade = CascadeType.ALL)
    private AnswerEntity ans;

    public QuestionEntity() {
    }

    public QuestionEntity(int question_id, String question, AnswerEntity ans) {
        this.question_id = question_id;
        this.question = question;
        this.ans = ans;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public AnswerEntity getAns() {
        return ans;
    }

    public void setAns(AnswerEntity ans) {
        this.ans = ans;
    }
}
