document.addEventListener('DOMContentLoaded', () => {
    const audioPlayer = document.getElementById('audioPlayer');
    const playPauseButton = document.getElementById('play-pause');
    const prevButton = document.getElementById('prev');
    const nextButton = document.getElementById('next');
    const songList = document.getElementById('song-list');
    const sidebar = document.getElementById('sidebar');
    const toggleSidebarButton = document.getElementById('toggle-sidebar');
    const songTitle = document.getElementById('song-title');
    const songImage = document.getElementById('song-image');
    const progressBar = document.getElementById('progress-bar');
    const currentTimeDisplay = document.getElementById('current-time');
    const durationDisplay = document.getElementById('duration');

    let isPlaying = false;
    let currentSongIndex = 0;
    let songs = [
        { title: 'Aathi enna nee', file: 'Aathi.mp3', image: '' },
        { title: 'Dhimu-Dhimu', file: 'Dhimu-Dhimu.mp3', image: '' },
        { title: 'Kurumugil', file: 'Kurumugil-MassTamilan.dev.mp3', image: '' },
        { title: 'Maduraikku', file: 'Maduraikku-MassTamilan.fm.mp3', image: '' },
        { title: 'Nenjil-Nenjil', file: 'Nenjil-Nenjil.mp3', image: '' },
        { title: 'Nenjukulla-Nee', file: 'Nenjukulla-Nee.mp3', image: '' },
        { title: 'Paalam', file: 'Paalam.mp3', image: '' },
        { title: 'Pakkam-Vanthu', file: 'Pakkam-Vanthu.mp3', image: '' },
        { title: 'Para-Para', file: 'Para-Para.mp3', image: '' },
        { title: 'Ponmagal-Vandaal', file: 'Ponmagal-Vandaal-MassTamilan.fm.mp3', image: '' },
        { title: 'Thee-Illai', file: 'Thee-Illai.mp3', image: '' },
        { title: 'Valayapatti', file: 'Valayapatti-MassTamilan.fm.mp3', image: '' },
        { title: 'Yathe-Yathe', file: 'Yathe-Yathe.mp3', image: '' },
        
    ];

    function updateSongInfo() {
        const song = songs[currentSongIndex];
        audioPlayer.src = `Music/${song.file}`;
        songTitle.textContent = song.title;
        songImage.src = song.image; 
        audioPlayer.load(); 
        audioPlayer.play();
        playPauseButton.innerHTML = '<i class="fas fa-pause"></i>';
        isPlaying = true;
    }

    function togglePlayPause() {
        if (isPlaying) {
            audioPlayer.pause();
        } else {
            audioPlayer.play();
        }
        isPlaying = !isPlaying;
        playPauseButton.innerHTML = isPlaying ? '<i class="fas fa-pause"></i>' : '<i class="fas fa-play"></i>';
    }

    function prevSong() {
        currentSongIndex = (currentSongIndex - 1 + songs.length) % songs.length;
        updateSongInfo();
        audioPlayer.play();
        playPauseButton.innerHTML = '<i class="fas fa-pause"></i>';
        isPlaying = true;
    }

    function nextSong() {
        currentSongIndex = (currentSongIndex + 1) % songs.length;
        updateSongInfo();
        audioPlayer.play();
        playPauseButton.innerHTML = '<i class="fas fa-pause"></i>';
        isPlaying = true;
    }

    function updateProgress() {
        const { currentTime, duration } = audioPlayer;
        progressBar.value = (currentTime / duration) * 100;
        currentTimeDisplay.textContent = formatTime(currentTime);
        durationDisplay.textContent = formatTime(duration);
    }

    function formatTime(time) {
        const minutes = Math.floor(time / 60);
        const seconds = Math.floor(time % 60);
        return `${minutes}:${seconds < 10 ? '0' : ''}${seconds}`;
    }

    audioPlayer.addEventListener('timeupdate', updateProgress);

    audioPlayer.addEventListener('ended', nextSong);

    progressBar.addEventListener('input', () => {
        audioPlayer.currentTime = (progressBar.value / 100) * audioPlayer.duration;
    });

    toggleSidebarButton.addEventListener('click', () => {
        sidebar.classList.toggle('hidden');
    });

    playPauseButton.addEventListener('click', togglePlayPause);
    prevButton.addEventListener('click', prevSong);
    nextButton.addEventListener('click', nextSong);

    songs.forEach((song, index) => {
        const li = document.createElement('li');
        li.innerHTML = `<i class="fas fa-music"></i> ${song.title}`;
        li.addEventListener('click', () => {
            currentSongIndex = index;
            updateSongInfo();
            audioPlayer.play();
            playPauseButton.innerHTML = '<i class="fas fa-pause"></i>';
            isPlaying = true;
        });
        songList.appendChild(li);
    });

    updateSongInfo();
});