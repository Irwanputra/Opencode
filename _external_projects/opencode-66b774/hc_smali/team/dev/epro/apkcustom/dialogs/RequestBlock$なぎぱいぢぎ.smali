.class public Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 6

    .line 1
    :try_start_0
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    iget-object p2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 3
    iget-object v0, p2, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    .line 4
    iget-object p2, p2, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->きぬどぼみ〸:Ljava/lang/String;

    .line 5
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ずまげせび〳(Ljava/io/File;Ljava/lang/String;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    const p2, 0x7f110312

    invoke-virtual {p1, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 6
    iget-object v2, v2, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    aput-object v2, v0, v1

    .line 7
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, -0x100

    .line 8
    invoke-virtual {p1, p2, v0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    .line 9
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setResult(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_34} :catch_34

    :catch_34
    return-void
.end method
