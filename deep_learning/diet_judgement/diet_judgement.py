import requests

def diet_judgment(age, height, weight, gender, calorie, protein, carbohydrate, fat, exercise_time):
    bmr = 0
    if gender == 'male':
        bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age)
    elif gender == 'female':
        bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age)

    # Calculating Total Energy Expenditure (TEE)
    tee = bmr * (1.2 + (0.175 * exercise_time))

    # Calculating Macros ratio
    protein_ratio = protein * 4 / calorie
    carbohydrate_ratio = carbohydrate * 4 / calorie
    fat_ratio = fat * 9 / calorie

    # Checking if the calorie is balanced or not
    if calorie < tee *0.9:
        calorie_judgement = "You gonna lose weight"
    elif calorie > tee *1.1:
        calorie_judgement = "You gonna gain weight"
    else:
        calorie_judgement = "Calorie intake is balanced"

    # Checking if the diet is balanced or not
    if protein_ratio >= 0.15:
        protein_judgement = "Not enough protein"
    elif protein_ratio <= 0.30:
        protein_judgement = "Too much protein"
    else:
        protein_judgement = "Balanced protein"

    if carbohydrate_ratio >= 0.47:
        carbohydrate_judgement = "Not enough carbohydrate"
    elif carbohydrate_ratio <= 0.63:
        carbohydrate_judgement = "Too much carbohydrate"
    else:
        carbohydrate_judgement = "Balanced carbohydrate"

    if fat_ratio >= 0.23:
        fat_judgement = "Not enough fat"
    elif fat_ratio <= 0.27:
        fat_judgement = "Too much fat"
    else:
        fat_judgement = "Balanced fat"

    data = {
        "age": age,
        "height": height,
        "weight": weight,
        "gender": gender,
        "calorie": calorie,
        "protein": protein,
        "carbohydrate": carbohydrate,
        "fat": fat,
        "exercise_time": exercise_time,
        "calorie_judgement": calorie_judgement,
        "protein_judgement": protein_judgement,
        "carbohydrate_judgement": carbohydrate_judgement,
        "fat_judgement": fat_judgement
    }

    response = requests.post("http://localhost:8080/api/AI/getNutritionalInfo", json=data)
    if response.status_code == 200:
        print("Data sent to the server successfully.")
    else:
        print("Failed to send data to the server.")

        
age = int(input())
height = float(input())
weight = float(input())
gender = str(input()) 
calorie = float(input()) 
protein = float(input()) 
carbohydrate = float(input()) 
fat = float(input()) 
exercise_time = float(input())