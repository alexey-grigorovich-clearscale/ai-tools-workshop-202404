def process_data():
    # Simulated data fetch
    raw_data = "name:John Doe,age:29;name:Jane Smith,age:34"
    
    # Processing data
    entries = raw_data.split(";")
    for entry in entries:
        details = entry.split(",")
        name = details[0].split(":")[1]
        age = details[1].split(":")[1]
        
        # Output generation
        print(f"Name: {name}, Age: {age}")

if __name__ == "__main__":
    process_data()
