/**
 * Validação de formulário
 * @author Anderson
 */

function validar() {
    const nome = frmContato.nome.value.trim();
    const fone = frmContato.fone.value.trim();
    const email = frmContato.email.value.trim();
    const dataConsulta = frmContato.dataConsulta.value.trim();
    const horaConsulta = frmContato.horaConsulta.value.trim();

    // Validações existentes
    if (nome === "") {
        alert('Preencha o campo nome');
        frmContato.nome.focus();
        return false;
    } else if (fone === "") {
        alert('Preencha o campo fone');
        frmContato.fone.focus();
        return false;
    } else if (email === "") {
        alert('Preencha o campo e-mail');
        frmContato.email.focus();
        return false;
    } else if (!validarEmail(email)) {
        alert('Preencha um e-mail válido');
        frmContato.email.focus();
        return false;
    }

    // Novas validações para data e hora
    if (dataConsulta === "") {
        alert('Preencha o campo data da consulta');
        frmContato.dataConsulta.focus();
        return false;
    } else if (!validarData(dataConsulta)) {
        alert('Preencha uma data válida no formato yyyy-mm-dd');
        frmContato.dataConsulta.focus();
        return false;
    }

    if (horaConsulta === "") {
        alert('Preencha o campo hora da consulta');
        frmContato.horaConsulta.focus();
        return false;
    } else if (!validarHora(horaConsulta)) {
        alert('Preencha uma hora válida no formato HH:mm');
        frmContato.horaConsulta.focus();
        return false;
    }

    // Se todas as validações passarem
    return true;
}

function validarEmail(email) {
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}

function validarData(data) {
    // Verifica se a data está no formato yyyy-mm-dd
    const regex = /^\d{4}-\d{2}-\d{2}$/;
    if (!regex.test(data)) return false;

    // Verifica se a data é válida
    const dataObj = new Date(data);
    return dataObj.toISOString().slice(0, 10) === data;
}

function validarHora(hora) {
    // Verifica se a hora está no formato HH:mm
    const regex = /^([01]\d|2[0-3]):([0-5]\d)$/;
    return regex.test(hora);
}
