package homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

//@Entity
//@Table(name="Income_Source")
public class IncomeSource {

   // @Id
   // @GeneratedValue
    private Long id;

    private String incomeName;

    private LocalDateTime creationDateTime;

    private boolean deleted;

    public IncomeSource() {
    }

    public IncomeSource(String incomeName, LocalDateTime creationDateTime, boolean deleted) {
        this.incomeName = incomeName;
        this.creationDateTime = creationDateTime;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "IncomeSource{" +
                "id=" + id +
                ", incomeName='" + incomeName + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", deleted=" + deleted +
                '}';
    }
}
