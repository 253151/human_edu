# -*- coding: utf-8 -*-

import pandas as pd
from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
import joblib # 모델 내보내기

data = pd.read_csv('data/iris.csv')
# print(data.head())
le = LabelEncoder()
data['species'] = le.fit_transform(data['species'])

X = data.drop(columns=['species'])
y = data['species']


X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.25)
model = LogisticRegression()
model.fit(X_train, y_train)

model_file = open('models/logis_iris_model_230126.pkl', 'wb')
joblib.dump(model, model_file)
model_file.close()
