.class public Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->onResume()V
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 3

    if-eqz p2, :cond_a

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〺つふすそ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 1
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    const/4 p2, 0x1

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    :cond_a
    return-void
.end method
