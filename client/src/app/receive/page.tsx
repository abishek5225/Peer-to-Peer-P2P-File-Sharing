"use client"
import { useState } from "react"

export default function ReceivePage(){
    const [downloading, setDownloading]= useState(false);

    const handleReceive= async()=>{
        setDownloading(true);
        try{
            const res= await fetch("http://localhost:8080/receive");
            
        }
    }
}