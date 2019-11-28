package team.project.io.beneres.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseHandler {

    public FirebaseHandler() {
        
    }

    public DatabaseReference getFirebaseConnection(String tableName) {
        return FirebaseDatabase.getInstance().getReference(tableName);
    }
}
