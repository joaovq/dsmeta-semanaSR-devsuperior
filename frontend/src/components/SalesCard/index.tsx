import NotificationButton from '../NotificationButton'
import './style.css'
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { useEffect, useState } from 'react';
import axios from 'axios';
import { BASE_URL } from '../../utils/request';
import { Sale } from '../../models/sale';

function SalesCard() {

  const min = new Date(new Date().setDate(new Date().getDate() -365));

  const max = new Date();
  const [minDate, setMinDate] = useState(min);
  const [maxDate,setMaxDate] = useState(max);

  //  useState<Sale[]>([]) indica que o valor inicial vai ser uma lista vazia.
  const [sales,setSales] = useState<Sale[]>([]);

  // O axios.get() retorna um objeto chamado Promise.
  //  É um objeto que retorna uma operação que pode dar certo ou falhar
  //  Dessa forma utilizamos o then, caso der certo. 
  // Colocamos uma função para esse objeto fazer quando tiver resposta.
  useEffect(() => {  
    axios.get(`${BASE_URL}/sales/findSales`).then(response => {
      setSales(response.data.content)
      console.log(response.data)
    });
  }, []);

  return (
    <div className="dsmeta-card">
      <h2 className="dsmeta-sales-title">Vendas</h2>
      <div>
        <div className="dsmeta-form-control-container">
          <DatePicker
            selected={minDate}
            onChange={(date: Date) => setMinDate(date)}
            className="dsmeta-form-control"
            dateFormat="dd/MM/yyyy"
          />
        </div>
        <div className="dsmeta-form-control-container">
          <DatePicker
            selected={maxDate}
            onChange={(date: Date) => setMaxDate(date)}
            className="dsmeta-form-control"
            dateFormat="dd/MM/yyyy"
          />
        </div>
      </div>

      <div>
        <table className="dsmeta-sales-table">
          <thead>
            <tr>
              <th className="show992">ID</th>
              <th className="show576">Data</th>
              <th>Vendedor</th>
              <th className="show992">Visitas</th>
              <th className="show992">Vendas</th>
              <th>Total</th>
              <th>Notificar</th>
            </tr>
          </thead>
          <tbody>
            {
              //  O metodo map faz percorrer a lista e executar uma função para cada elemento
              sales.map(sale =>{
                return(
                  <tr key={sale.id}>
                  <td className="show992">{sale.id}</td>
                  {/* Formata a String para um formato de Data */}
                  <td className="show576">{new Date(sale.date).toLocaleDateString()}</td>
                  <td>{sale.name}</td>
                  <td className="show992">{sale.visited}</td>
                  <td className="show992">{sale.deals}</td>
                  {/* toFixed(casasDecimais) */}
                  <td>R$ {sale.amount.toFixed(2)}</td>
                  <td>
                    <div className="dsmeta-red-btn-container">
                      <NotificationButton />
                    </div>
                  </td>
                </tr>
                )
            })
            }

          </tbody>

        </table>
      </div>

    </div>
  )
}

export default SalesCard
