/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.CargoEnterprise;

/**
 *
 * @author Sathya
 */
public class AirlinesSchedule {
    String airline;
    String flight_id;
    String start_time;
    String dept_airport;
    String arr_time;
    String arr_airport;
    int spots;
    String date;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getDept_airport() {
        return dept_airport;
    }

    public void setDept_airport(String dept_airport) {
        this.dept_airport = dept_airport;
    }

    public String getArr_time() {
        return arr_time;
    }

    public void setArr_time(String arr_time) {
        this.arr_time = arr_time;
    }

    public String getArr_airport() {
        return arr_airport;
    }

    public void setArr_airport(String arr_airport) {
        this.arr_airport = arr_airport;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }
    
    public String toString(){
        return this.airline;
    }
    
        public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
