package net.nhatien.todolist.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2010-09-17 21:54:52")
/** */
public final class TaskMeta extends org.slim3.datastore.ModelMeta<net.nhatien.todolist.model.Task> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.lang.Boolean> closed = new org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.lang.Boolean>(this, "closed", "closed", java.lang.Boolean.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<net.nhatien.todolist.model.Task> content = new org.slim3.datastore.StringAttributeMeta<net.nhatien.todolist.model.Task>(this, "content", "content");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.util.Date> created = new org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.util.Date>(this, "created", "created", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.util.Date> dueDate = new org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.util.Date>(this, "dueDate", "dueDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<net.nhatien.todolist.model.Task> email = new org.slim3.datastore.StringAttributeMeta<net.nhatien.todolist.model.Task>(this, "email", "email");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<net.nhatien.todolist.model.Task, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final TaskMeta slim3_singleton = new TaskMeta();

    /**
     * @return the singleton
     */
    public static TaskMeta get() {
       return slim3_singleton;
    }

    /** */
    public TaskMeta() {
        super("Task", net.nhatien.todolist.model.Task.class);
    }

    @Override
    public net.nhatien.todolist.model.Task entityToModel(com.google.appengine.api.datastore.Entity entity) {
        net.nhatien.todolist.model.Task model = new net.nhatien.todolist.model.Task();
        model.setClosed((java.lang.Boolean) entity.getProperty("closed"));
        model.setContent((java.lang.String) entity.getProperty("content"));
        model.setCreated((java.util.Date) entity.getProperty("created"));
        model.setDueDate((java.util.Date) entity.getProperty("dueDate"));
        model.setEmail((java.lang.String) entity.getProperty("email"));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        net.nhatien.todolist.model.Task m = (net.nhatien.todolist.model.Task) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("closed", m.getClosed());
        entity.setProperty("content", m.getContent());
        entity.setProperty("created", m.getCreated());
        entity.setProperty("dueDate", m.getDueDate());
        entity.setProperty("email", m.getEmail());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        net.nhatien.todolist.model.Task m = (net.nhatien.todolist.model.Task) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        net.nhatien.todolist.model.Task m = (net.nhatien.todolist.model.Task) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        net.nhatien.todolist.model.Task m = (net.nhatien.todolist.model.Task) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void incrementVersion(Object model) {
        net.nhatien.todolist.model.Task m = (net.nhatien.todolist.model.Task) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
        assignKeyIfNecessary(model);
        incrementVersion(model);
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

}