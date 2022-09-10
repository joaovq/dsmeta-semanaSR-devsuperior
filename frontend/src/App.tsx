import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SalesCard from "./components/SalesCard"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';


function App() {
  return (
    //Para mais de um componente, temos que colocar <> e no final </> (fragment)
    <>
    <ToastContainer/>
      <Header/>
      {/* //Aqui chamamos o component NotificationButton que criamos para o botão de notificação */}
      <main>
      <section id="sales">
        <div className="dsmeta-container">
          <SalesCard/>
        </div>
        </section>
        </main>
    </>
  )
}

export default App
