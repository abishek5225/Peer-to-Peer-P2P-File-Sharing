"use client"
import { useState } from "react"

export default function ReceivePage(){
    const [downloading, setDownloading]= useState(false);

    const handleReceive= async()=>{
        setDownloading(true);
        try{
            const res= await fetch("http://localhost:8080/receive");
            const blob= await res.blob();

        } catch (ex) {
        console.log(ex);
    }
    }
    return(
        <div className="bg-gray-500 min-h-screen flex flex-col items-center justify-center">
            <h1 className="text-5xl font-bold mb-4">Receive a File</h1>
            <div className="h-24 ">

            </div>
        </div>
    )
}