library(dplyr)
library(ggplot2)

# 데이터불러오기
data(iris)
str(iris)

iris %>%
  select(Species) %>% head()


iris %>%
  rename ("종"="Species") %>% head() %>%
  select(종)

iris %>% head()%>%
  # OR 연산자, AND 연산자
  filter(Sepal.Length == 5.1 | Sepal.Width == 3.0)

## 그래프 종류 검색, ggplot2
 data("mpg", package = "ggplot2")
 
 mpg %>%
   arrang(desc(cty)) %>%
   head(n=6)
 
 -- GROUP BY 연산자
 
 new_df = iris %>%
   group by(Species)%>%
   summarise(avg = mean (Sepal.Length))
 new_df
 
 ## new_df 막대그래프 코드 작성
 ggplot(new_df)