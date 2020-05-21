package com.example.basiccalculator;

import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class FirebaseController {
    FirebaseFirestore db;
    public FirebaseController() {
        db=FirebaseFirestore.getInstance();
    }

    public void saveToFirebase(String finalCalculation) {
        HashMap<String, Object> equations = new HashMap<>();
        equations.put("equation", finalCalculation );
        equations.put("timestamp", FieldValue.serverTimestamp());
        db.collection("equations").add(equations);
    }
}