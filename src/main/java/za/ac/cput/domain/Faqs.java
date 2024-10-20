package za.ac.cput.domain;

/**Faqs.java
 * Domain class for Faqs page
 * Author: Tsireledzo Nemushungwa (221196803)
 * Date: 03/03/2024
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
public class Faqs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    private String answer;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Faqs() {
    }

    public Faqs(Builder builder) {
        this.id = builder.id;
        this.question = builder.question;
        this.answer = builder.answer;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faqs faq = (Faqs) o;
        return id == faq.id && Objects.equals(question, faq.question) && Objects.equals(answer, faq.answer) && Objects.equals(createdAt, faq.createdAt) && Objects.equals(updatedAt, faq.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Faq{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public static class Builder {
        private int id;
        private String question;
        private String answer;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setQuestion(String question) {
            this.question = question;
            return this;
        }

        public Builder setAnswer(String answer) {
            this.answer = answer;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder copy(Faqs faq) {
            this.id = faq.id;
            this.question = faq.question;
            this.answer = faq.answer;
            this.createdAt = faq.createdAt;
            this.updatedAt = faq.updatedAt;
            return this;
        }

        public Faqs build() {
            return new Faqs(this);
        }
    }
}
