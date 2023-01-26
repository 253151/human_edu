# -*- coding: utf-8 -*-
# BMI 계산기 간단하게 만들어보기

import streamlit as st 

def main():

    # 제목 
    st.title('BMI 계산기')

    # 몸무게 저장 변수
    weight = st.number_input('몸무게를 입력해주세요. (Kg)')

    # 단위 선택
    h_format = st.radio('키 입력 단위 설정:', ('cm', 'm', 'feet'))

    # 단위별 BMI 계산기 입력
    if h_format == 'cm' : 
        height = st.number_input('키(cm)을 입력해주세요.')

        try :
            bmi_result = weight/((height / 100)**2)
        except :
            st.text('올바른 숫자를 입력해주세요.')

    elif h_format == 'm': 
        height = st.number_input('키(m)을 입력해주세요.')
        
        try :
            bmi_result = weight/(height**2)
        except :
            st.text('올바른 숫자를 입력해주세요.')


    else:  #feet일 경우
        height = st.number_input('키(feet)을 입력해주세요.')

        height = height*0.3048

        try :
            bmi_result = weight/(height**2)
        except :
            st.text('올바른 숫자를 입력해주세요.')

    if (st.button('BMI 계산기')):
        st.text(bmi_result)

        if bmi_result >= 30:
            st.error('비만')
        elif bmi_result >=25:
            st.error('과체중')
        elif bmi_result >=20:
            st.success('정상')
        else:
            st.warning('저체중')




if __name__ == "__main__":
    main()