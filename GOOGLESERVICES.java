public ProjectFile google_services = new ProjectFile(".json");
@Override
public void start() {
    FirebaseAuth.setAPIFile(google_services);
}