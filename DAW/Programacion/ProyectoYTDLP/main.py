import PySimpleGUI as sg
import yt_dlp

layout = [
    [sg.Text('Video URL:'), sg.InputText(), sg.Button('Paste')],
    [sg.Text('Format:'), sg.Combo(['mp4 (best)', 'mp3', '720p'], key='-FORMAT-')],
    [sg.Button('Download'), sg.Exit()],
    [sg.Multiline(size=(60, 10), key='-OUTPUT-', autoscroll=True)]
]

window = sg.Window('yt-dlp GUI', layout)

while True:
    event, values = window.read()
    if event in (sg.WIN_CLOSED, 'Exit'):
        break
    if event == 'Download':
        url = values[0]
        # Configure yt-dlp options based on the format selected
        ydl_opts = {'outtmpl': '%(title)s.%(ext)s'}
        # Send progress hooks to the Multiline output element
        with yt_dlp.YoutubeDL(ydl_opts) as ydl:
            ydl.download([url])