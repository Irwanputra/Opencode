.class public Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;


# direct methods
.method public constructor <init>(Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;I)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    iput p2, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;->〺つふすそ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    iget v1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    return-void
.end method
