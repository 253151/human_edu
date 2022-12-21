# 라이브러리 설치
# install.packages("패키지명")
# load 라이브러리
# 파이썬 라이브러리 숫자가 20만개 넘음
# R, 2만개 미만
library(ggplot2)

data("mpg")
str(mpg)

# 산점도
ggplot(mpg, aes(x = displ, y = cty)) +
  geom_point()

# R의 강점
# 시각화가 매우 좋다!

# ??geom_point

p <- ggplot(mtcars, aes(wt, mpg))
p + geom_point

# 분석의 끝은 보고서, Report
# 통계 수치가 들어갔으면
# 텍스트가 추가 되었으면

# 라이브러리 설치
# install.package("ggstatsplot")
library(ggstatsplot)

ggscatterstats(
  data  = mpg,
  x     = displ,
  y     = cty,
  xlab  = "REM sleep (in hours)",
  ylab  = "Amount of time spent awake (in hours)",
  title = "Understanding mammalian sleep"
)

library(ggside)




