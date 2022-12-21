# 데이터 가공
# sql 문법과 매우 유사하다!
# dplyr

library(dplyr)

data(iris)
str(iris)

# filter 조건문, 행추출
# Sepal.Length가 5 이상인 데이터만 추출
# %>% 연결 연산자
data2 = iris %>% 
  filter(Sepal.Length >= 5) %>%
  select(Sepal.Length, Petal.Length, Species) %>%
  group_by(Species) %>%
  summarise(total = sum(Sepal.Length),
              avg = mean(Sepal.Length))

data2

