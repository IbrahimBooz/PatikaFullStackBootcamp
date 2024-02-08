document.addEventListener("keydown", function (e) {
  if (e.key === "a") {
    let a = document.getElementById("a");
    a.style.background = "red";
    a.style.scale = 1.1;
    const audio = new Audio("Audio/boom.wav");
    audio.play();
  }
  if (e.key === "s") {
    let s = document.getElementById("s");
    s.style.background = "red";
    s.style.scale = 1.1;
    const audio = new Audio("Audio/clap.wav");
    audio.play();
  }
  if (e.key === "d") {
    let d = document.getElementById("d");
    d.style.background = "red";
    d.style.scale = 1.1;
    const audio = new Audio("Audio/hihat.wav");
    audio.play();
  }
  if (e.key === "f") {
    let f = document.getElementById("f");
    f.style.background = "red";
    f.style.scale = 1.1;
    const audio = new Audio("Audio/kick.wav");
    audio.play();
  }
  if (e.key === "g") {
    let g = document.getElementById("g");
    g.style.background = "red";
    g.style.scale = 1.1;
    const audio = new Audio("Audio/openhat.wav");
    audio.play();
  }
  if (e.key === "h") {
    let h = document.getElementById("h");
    h.style.background = "red";
    h.style.scale = 1.1;
    const audio = new Audio("Audio/ride.wav");
    audio.play();
  }
  if (e.key === "j") {
    let j = document.getElementById("j");
    j.style.background = "red";
    j.style.scale = 1.1;
    const audio = new Audio("Audio/snare.wav");
    audio.play();
  }
  if (e.key === "k") {
    let k = document.getElementById("k");
    k.style.background = "red";
    k.style.scale = 1.1;
    const audio = new Audio("Audio/tink.wav");
    audio.play();
  }
  if (e.key === "l") {
    let l = document.getElementById("l");
    l.style.background = "red";
    l.style.scale = 1.1;
    const audio = new Audio("Audio/tom.wav");
    audio.play();
  }
});

document.addEventListener("keyup", function (e) {
  if (e.key === "a") {
    a.style.background = "#0B60B0";
    a.style.scale = 1;
  }
  if (e.key === "s") {
    s.style.background = "#0B60B0";
    s.style.scale = 1;
  }
  if (e.key === "d") {
    d.style.background = "#0B60B0";
    d.style.scale = 1;
  }
  if (e.key === "f") {
    f.style.background = "#0B60B0";
    f.style.scale = 1;
  }
  if (e.key === "g") {
    g.style.background = "#0B60B0";
    g.style.scale = 1;
  }
  if (e.key === "h") {
    h.style.background = "#0B60B0";
    h.style.scale = 1;
  }
  if (e.key === "j") {
    j.style.background = "#0B60B0";
    j.style.scale = 1;
  }
  if (e.key === "k") {
    k.style.background = "#0B60B0";
    k.style.scale = 1;
  }
  if (e.key === "l") {
    l.style.background = "#0B60B0";
    l.style.scale = 1;
  }
});
