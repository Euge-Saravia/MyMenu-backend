package mymenu.mymenu.models;



import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
// import jakarta.persistence.Temporal;
// import jakarta.persistence.TemporalType;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    // @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "plate_id")
    private Plate plate;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    private Menu() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Plate getPlate() {
        return this.plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public Meal getMeal() {
        return this.meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

}
