# -*- coding: utf-8 -*-

import streamlit as st
from PIL import Image

def main():
    # 이미지 파일 불러오기
    img = Image.open('data/image_03.jpg')
    st.image(img)

    # 비디오 출력
    with open('영상파일경로입력','rb') as rb:
        video_file = rb.read()
        st.video(video_file, start_time=1)

    # 오디오 출력
    with open('data/song.mp3','rb') as rb:
        audio_file = rb.read()
        st.audio(audio_file, format='audio/mp3')

if __name__ == "__main__":
    main()