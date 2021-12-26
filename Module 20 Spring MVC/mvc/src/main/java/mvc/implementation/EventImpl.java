package mvc.implementation;

import mvc.model.Event;

import java.util.Date;
import java.util.SimpleDateFormat;

public class EventImpl implements Event {
    private long id;
    private String title;
    private Date date;

    public EventImpl(long id, String title, Date date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String dateString = new SimpleDateFormat("dd.MM.yyyy").format(date);
        return String.format("{id:%d,title:%s,date:%s}", id, title, dateString);
    }
}
