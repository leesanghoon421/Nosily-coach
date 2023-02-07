import tensorflow as tf
import pandas as pd
from sklearn.preprocessing import StandardScaler

loaded_model = tf.keras.models.load_model("weight_loss_ann.h5")

dataset = pd.read_csv('weight_loss_data.csv')
X = dataset.iloc[:, :-1].values
y = dataset.iloc[:, -1].values

from sklearn.preprocessing import LabelEncoder
le = LabelEncoder()
X[:,4] = le.fit_transform(X[:,4])

#Feature Scaling
sc = StandardScaler()
X = sc.fit_transform(X)

weight = float(input())
hour = float(input())
calorie = float(input())
age = int(input())
sex = int(input()) 
fat = float(input())

#print(ann.predict(sc.transform([[몸무게, 주당 운동시간, 1일 섭취 칼로리, 나이, 성별(여자=0, 남자=1), 체지방량]])))
#print(loaded_model.predict(sc.transform([[weight, hour, calorie, age, sex, fat]])))

import requests

# Define the API endpoint URL
url = "http://localhost:8080/api/AI/predictWeight"

# Define the data to send to the API
data = {
    "weight": weight,
    "hour": hour,
    "calorie": calorie,
    "age": age,
    "sex": sex,
    "fat": fat
}

# Make a POST request to the API
response = requests.post(url, json=data)

# Check if the request was successful
if response.status_code == 200:
    # Print the prediction returned by the API
    print(response.json()["prediction"])
else:
    print("Failed to connect to the API. Response code:", response.status_code)
