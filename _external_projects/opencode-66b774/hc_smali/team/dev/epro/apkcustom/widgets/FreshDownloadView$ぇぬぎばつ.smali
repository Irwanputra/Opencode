.class public final enum Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "\u3047\u306c\u304e\u3070\u3064"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$\u3047\u306c\u304e\u3070\u3064;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum 〺つふすそ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

.field public static final enum くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

.field public static final synthetic びぐびあび:[Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    new-instance v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    const-string v1, "\u001d0=A7iI7;Oc;I6=\u001a0h\u001edmA69\u001djkI`=\u001de"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;->〺つふすそ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    new-instance v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    const-string v3, "\u001a4i\u001bciN4kO1jOk<K`>@alIamJ4;Jfh\u001e1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    const/4 v3, 0x2

    new-array v3, v3, [Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;->びぐびあび:[Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;
    .registers 2

    const-class v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    return-object p0
.end method

.method public static values()[Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;
    .registers 1

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;->びぐびあび:[Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    invoke-virtual {v0}, [Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    return-object v0
.end method
