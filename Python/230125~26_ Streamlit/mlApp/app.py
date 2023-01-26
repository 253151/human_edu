# -*- coding: utf-8 -*-

import streamlit as st

# 공부할 것 : https://docs.streamlit.io/library/components/components-api
import streamlit.components.v1 as stc 

# 다른 파일의 함수를 불러온다.
from eda_app import run_eda_app
from ml_app import run_ml_app

html_temp = """
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-0lax{text-align:left;vertical-align:top}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-0lax">강의명</th>
    <th class="tg-0lax">Python, JAVA 기반 AI 활용 소프트웨어 개발 및 응용 과정</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0lax">교과목명</td>
    <td class="tg-0lax">기초문법</td>
  </tr>
  <tr>
    <td class="tg-0lax">프로젝트 주제</td>
    <td class="tg-0lax">파이썬 Streamlit 라이브러리를 활용한 IRIS 데이터 머신러닝 대시보드 개발</td>
  </tr>
  <tr>
    <td class="tg-0lax">프로젝트 마감일</td>
    <td class="tg-0lax">2023년 1월 26일</td>
  </tr>
  <tr>
    <td class="tg-0lax">수강생명</td>
    <td class="tg-0lax">박지수</td>
  </tr>
</tbody>
</table>
"""
dec_temp ="""
### IRIS 예측 모델 개발
- IRIS 데이터를 활용하여 간단한 EDA 및 예측 모델을 구현한다. 
#### 데이터
    + https://www.kaggle.com/datasets/saurabh00007/iriscsv
"""


def main():
    st.markdown(html_temp, unsafe_allow_html=True)
    
    menu = ['Home', '탐색적 자료 분석', '머신러닝', 'About']
    choice = st.sidebar.selectbox('메뉴',menu)
    
    if choice == "Home":
        st.subheader("Home")
        st.markdown(dec_temp, unsafe_allow_html=True)
    elif choice == '탐색적 자료 분석':
        run_eda_app()
    elif choice == '머신러닝':
        run_ml_app()
    else:
        st.subheader('About')

if __name__ == "__main__":
    main()