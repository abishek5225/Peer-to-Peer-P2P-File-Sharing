import Link from "next/link"

export default function Home() {
  return (
    <div className="font-sans grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20">
      <h1 className="text-5xl font-bold mb-6">Share Files</h1>
      <div className="flex gap-4">
        <Link href="/send">
        <button className="bg-blue-500 text-white hover:bg-blue-600 px-6 py-3 rounded-xl shadow">Send File</button>
        </Link>
      <Link href="/receive">
        <button className="bg-green-500 text-white hover:bg-green-600 px-6 py-3 rounded-xl shadow">Receive File</button>
        </Link>
      </div>

    </div>
  );
}
