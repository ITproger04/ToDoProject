package io.realm;


public interface com_example_todo_model_ProjectRealmProxyInterface {
    public String realmGet$projectId();
    public void realmSet$projectId(String value);
    public String realmGet$owner();
    public void realmSet$owner(String value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public java.util.Date realmGet$timestamp();
    public void realmSet$timestamp(java.util.Date value);
    public RealmList<com.example.todo.model.Item> realmGet$items();
    public void realmSet$items(RealmList<com.example.todo.model.Item> value);
}
