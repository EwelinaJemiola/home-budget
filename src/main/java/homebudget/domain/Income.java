package homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

//@Entity
public class Income {

   // @Id
   // @GeneratedValue
    private Long id;

    private boolean delete;

    private LocalDateTime creationDataTime;

    private LocalDate incomeDate;

    private BigDecimal incomeAmount;

    private IncomeSource incomeSource;

    private String title;

    public Income() {
    }

    public Income(boolean delete, LocalDateTime creationDataTime, LocalDate incomeDate, BigDecimal incomeAmount, IncomeSource incomeSource, String title) {
        this.delete = delete;
        this.creationDataTime = creationDataTime;
        this.incomeDate = incomeDate;
        this.incomeAmount = incomeAmount;
        this.incomeSource = incomeSource;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", delete=" + delete +
                ", creationDataTime=" + creationDataTime +
                ", incomeDate=" + incomeDate +
                ", incomeAmount=" + incomeAmount +
                ", incomeSource=" + incomeSource +
                ", title='" + title + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public LocalDateTime getCreationDataTime() {
        return creationDataTime;
    }

    public void setCreationDataTime(LocalDateTime creationDataTime) {
        this.creationDataTime = creationDataTime;
    }

    public LocalDate getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(LocalDate incomeDate) {
        this.incomeDate = incomeDate;
    }

    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public IncomeSource getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(IncomeSource incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
