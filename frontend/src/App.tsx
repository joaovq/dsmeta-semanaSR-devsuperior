import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SalesCard from "./components/SalesCard"


function App() {
  return (
    //Para mais de um componente, temos que colocar <> e no final </> (fragment)
    <>
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
