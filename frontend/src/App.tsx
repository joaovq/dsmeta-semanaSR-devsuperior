import NotificationButton from "./components/NotificationButton"


function App() {
  return (
    //Para mais de um componente, temos que colocar <> e no final </> (fragment)
    <>
      <h1>Olá mundo</h1>
      //Aqui chamamos o component NotificationButton que criamos para o botão de notificação
      <NotificationButton/>
    </>
  )
}

export default App
