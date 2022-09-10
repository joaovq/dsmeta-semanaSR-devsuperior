//  o ..(para voltar para pastas anteriores) faz voltar para a pasta assets. 
import axios from 'axios';
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request';
// mesma pasta é um único ponto
import './style.css'

type Props = {
  saleId:number;
}

function NotificationButton({saleId}: Props) {

  function handleClick(id:number){
    axios(`${BASE_URL}/sales/${id}/notification`).then(response =>{
      toast.info("Sms enviado com sucesso");
    })
  }
    return (
        <div className="dsmeta-red-btn" onClick={()=>{
          handleClick(saleId);
        }}>
        <img src={icon} alt="Notificar" />
      </div>
    )
  }
  
  export default NotificationButton
  