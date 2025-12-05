# 🔐 Secure Credential Generator (Java)

A lightweight but powerful Java-based credential generation utility featuring:

- ✅ Secure random password generation  
- ✅ Strong password validation rules  
- ✅ Salted SHA-256 hashing  
- ✅ AES-GCM encryption & decryption  
- ✅ Clean modular design  
- ✅ CLI-based demonstration program  

This project demonstrates industry-grade security concepts in a simple, understandable format — perfect for backend, security-focused, and systems engineering applications.

---

## 🚀 Features

### **1. Secure Password Generator**
- Uses `SecureRandom` (cryptographically strong)
- Ensures password complexity:
  - Uppercase letters  
  - Lowercase letters  
  - Numbers  
  - Special characters  
- Includes automatic randomization/shuffling  
- Minimum length of 8 (recommended 12+)

---

### **2. Password Validation**
Rules include:
- At least 12 characters  
- Includes uppercase  
- Includes lowercase  
- Includes digits  
- Includes special characters  

---

### **3. Salted SHA-256 Hashing**
- Generates a random salt for every password
- Uses `MessageDigest` with SHA-256
- Encodes output in Base64
- Demonstrates proper secure storage technique (one-way hashing)

---

### **4. AES-GCM Encryption / Decryption**
- Uses AES-256 in GCM mode (authenticated encryption)
- Random IV generation
- Output encoded as Base64
- Example included for both encryption & decryption

---

## 📁 Project Structure
src/
CredentialGenerator.java // Main entry point (CLI)
PasswordUtils.java // Password generation + validation
HashUtils.java // Salted hashing utilities
EncryptionUtils.java // AES-GCM encryption utilities

🛠️ Tech Used

Java 25+

AES-GCM encryption

SHA-256 hashing

SecureRandom

Base64 encoding

CLI application
---

## ▶️ How to Run
 Install Java
### **1. Compile**
```bash
javac src/*.java

java -cp src CredentialGenerator


##Future Enhancements (optional ideas)##

GUI using JavaFX

REST API using Spring Boot

Save encrypted passwords to a local file

User-defined password policies

Integration with a database

🤝 Contributing

Contributions, feature suggestions, and feedback are welcome!