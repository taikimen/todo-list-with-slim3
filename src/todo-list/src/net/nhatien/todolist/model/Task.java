package net.nhatien.todolist.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

/**
 * 
 * 
 * @author shimazu
 */
@Model(schemaVersion = 1)
public class Task implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;

    /**  */
    @Attribute(primaryKey = true)
    private Key key;

    /**  */
    @Attribute(version = true)
    private Long version;

    /**  */
    private String email;

    /**  */
    private Date dueDate;

    /**  */
    private Date created;

    /**  */
    private String content;

    /**  */
    private Boolean closed;

    /**
     * Returns the key.
     * 
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     * 
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     * 
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * 
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Task other = (Task) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    /**
     * @param dueDate
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param closed
     */
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    /**
     * @return closed
     */
    public Boolean getClosed() {
        return closed;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }
}
