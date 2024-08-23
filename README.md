### This repository consists of some popular problems from leetcode.


useEffect(() => {
    const handleContextMenu = (e: { preventDefault: () => void; }) => {
      e.preventDefault();
    };

    document.addEventListener("contextmenu", handleContextMenu);

    return () => {
      document.removeEventListener("contextmenu", handleContextMenu);
    };
  }, []);


  useEffect(() => {
    const handleKeydown = (e: { ctrlKey: any; key: string; preventDefault: () => void; shiftKey: any; }) => {
      if (e.ctrlKey && (e.key === 'u' || e.key === 'U')) {
        e.preventDefault();
      }
      if (e.ctrlKey && e.shiftKey && (e.key === 'I' || e.key === 'i')) {
        e.preventDefault();
      }
    };

    document.addEventListener("keydown", handleKeydown);

    return () => {
      document.removeEventListener("keydown", handleKeydown);
    };
  }, []);
