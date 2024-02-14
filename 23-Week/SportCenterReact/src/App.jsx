import { useState } from 'react'
import Header from './components/Header'
import Classes from './components/Classes';
import './App.css'
import Trainers from './components/Trainers';
import Purchase from './components/Purchase';
import Review from './components/Review';
import Contact from './components/Contact';
import Footer from './components/Footer';
import Calculator from './components/Calculator';

function App() {

  return (
    <>
      <Header />
      <Classes />
      <Calculator />
      <Trainers />
      <Purchase />
      <Review />
      <Contact />
      <Footer />
    </>
  )
}

export default App
